import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game2GUI extends JFrame {

    // Game variables
    private double str = 0;
    private double lky = 0;
    private double spd = 0;
    private double hp = 100;
    private double ehp = 0;
    private String rollName = "";
    private JLabel statsLabel;
    private JTextArea gameTextArea;
    
    public Game2GUI() {
        // Setup window
        setTitle("Text Game with Graphics");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout for the main content
        setLayout(new BorderLayout());

        // Text area to display game information
        gameTextArea = new JTextArea();
        gameTextArea.setEditable(false);
        add(new JScrollPane(gameTextArea), BorderLayout.CENTER);

        // Panel for character stats and actions
        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new GridLayout(2, 1));
        statsLabel = new JLabel("Select a character to start.");
        statsPanel.add(statsLabel);
        
        JButton fightButton = new JButton("Fight");
        fightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startBattle();
            }
        });
        statsPanel.add(fightButton);

        add(statsPanel, BorderLayout.EAST);

        // Character selection on startup
        selectCharacter();

        setVisible(true);
    }

    // Method to select character (with a GUI dialog box)
    public void selectCharacter() {
        String[] options = {"arc", "bar", "jes"};
        rollName = (String) JOptionPane.showInputDialog(null,
                "Select your character:",
                "Character Selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]);

        if (rollName != null) {
            switch (rollName) {
                case "arc":
                    str = 4;
                    lky = 5;
                    spd = 9;
                    break;
                case "bar":
                    str = 9;
                    lky = 3;
                    spd = 5;
                    break;
                case "jes":
                    str = 5;
                    lky = 9;
                    spd = 6;
                    break;
            }
            displayStats();
        }
    }

    // Method to display stats in the game window
    public void displayStats() {
        statsLabel.setText("<html>Character: " + rollName + "<br>Strength = " + str
                + "<br>Luck = " + lky + "<br>Speed = " + spd + "<br>Health = " + hp + "</html>");
        gameTextArea.append("You selected " + rollName + ". Your stats are: \n");
        gameTextArea.append("Strength = " + str + "\nLuck = " + lky + "\nSpeed = " + spd + "\nHealth = " + hp + "\n\n");
    }

    // Method to handle battle
    public void startBattle() {
        ehp = 100;
        gameTextArea.append("An enemy with 100 health approaches.\n");

        // Battle options
        int response = JOptionPane.showConfirmDialog(null,
                "An enemy appears! Do you want to attack?",
                "Battle",
                JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            double pdmg = str * 2;
            ehp -= pdmg;
            gameTextArea.append("You dealt " + pdmg + " damage. Enemy has " + ehp + " health remaining.\n");
            if (ehp <= 0) {
                gameTextArea.append("Congratulations, you defeated the enemy!\n");
            }
        } else {
            gameTextArea.append("You ran away from the battle.\n");
        }
    }

    public static void main(String[] args) {
        new Game2GUI();
    }
}
