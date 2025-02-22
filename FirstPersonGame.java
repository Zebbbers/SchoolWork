import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class FirstPersonGame {

    private long window;
    private float cameraX = 0, cameraY = 0, cameraZ = -5; // Camera Position
    private float pitch = 0, yaw = 0; // Camera Rotation

    public static void main(String[] args) {
        new FirstPersonGame().run();
    }

    public void run() {
        init();
        loop();
        GLFW.glfwTerminate();
    }

    private void init() {
        // Initialize GLFW
        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        // Create window
        window = GLFW.glfwCreateWindow(800, 600, "First Person Forest", 0, 0);
        if (window == 0) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        // Make the OpenGL context current
        GLFW.glfwMakeContextCurrent(window);
        GL.createCapabilities();

        // Setup a key callback for input
        GLFW.glfwSetKeyCallback(window, new KeyCallback());

        // Set clear color (sky color)
        GL11.glClearColor(0.5f, 0.8f, 1.0f, 1.0f);
    }

    private void loop() {
        // Enable depth testing
        GL11.glEnable(GL11.GL_DEPTH_TEST);

        // Game loop
        while (!GLFW.glfwWindowShouldClose(window)) {
            // Clear the framebuffer
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

            // Handle input and camera movement
            handleInput();

            // Set up camera
            Matrix4f viewMatrix = new Matrix4f()
                    .rotateX((float) Math.toRadians(pitch))
                    .rotateY((float) Math.toRadians(yaw))
                    .translate(-cameraX, -cameraY, -cameraZ);

            // Render the forest (simple trees as cubes)
            renderForest(viewMatrix);

            // Swap buffers and poll events
            GLFW.glfwSwapBuffers(window);
            GLFW.glfwPollEvents();
        }
    }

    private void handleInput() {
        // Movement controls
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_W) == GLFW.GLFW_PRESS) cameraZ += 0.05f;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_S) == GLFW.GLFW_PRESS) cameraZ -= 0.05f;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_A) == GLFW.GLFW_PRESS) cameraX -= 0.05f;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_D) == GLFW.GLFW_PRESS) cameraX += 0.05f;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_SPACE) == GLFW.GLFW_PRESS) cameraY -= 0.05f;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_LEFT_SHIFT) == GLFW.GLFW_PRESS) cameraY += 0.05f;

        // Rotate camera
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_LEFT) == GLFW.GLFW_PRESS) yaw += 1;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_RIGHT) == GLFW.GLFW_PRESS) yaw -= 1;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_UP) == GLFW.GLFW_PRESS) pitch += 1;
        if (GLFW.glfwGetKey(window, GLFW.GLFW_KEY_DOWN) == GLFW.GLFW_PRESS) pitch -= 1;
    }

    private void renderForest(Matrix4f viewMatrix) {
        // Set the view matrix
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadMatrixf(viewMatrix.get(new float[16]));

        // Render simple cubes as trees
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glColor3f(0.4f, 0.2f, 0); // Brown for trunks
        for (int i = -5; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
                GL11.glVertex3f(i, 0, j);
                GL11.glVertex3f(i + 0.5f, 0, j);
                GL11.glVertex3f(i + 0.5f, 2, j);
                GL11.glVertex3f(i, 2, j);
            }
        }
        GL11.glEnd();
    }

    // Custom Key Callback class to handle input
    private class KeyCallback extends GLFWKeyCallback {
        @Override
        public void invoke(long window, int key, int scancode, int action, int mods) {
            if (key == GLFW.GLFW_KEY_ESCAPE && action == GLFW.GLFW_PRESS) {
                GLFW.glfwSetWindowShouldClose(window, true); // Close window
            }
        }
    }
}
