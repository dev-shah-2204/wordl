import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MainFrame extends JFrame{
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel verifier1A;
    private JLabel verifier1B;
    private JLabel verifier1C;
    private JLabel verifier1D;
    private JLabel verifier1E;
    private JLabel verifier2A;
    private JLabel verifier2B;
    private JLabel verifier2C;
    private JLabel verifier2D;
    private JLabel verifier2E;
    private JLabel verifier3A;
    private JLabel verifier3B;
    private JLabel verifier3C;
    private JLabel verifier3D;
    private JLabel verifier3E;
    private JLabel verifier4A;
    private JLabel verifier4B;
    private JLabel verifier4C;
    private JLabel verifier4D;
    private JLabel verifier4E;
    private JLabel verifier5A;
    private JLabel verifier5B;
    private JLabel verifier5C;
    private JLabel verifier5D;
    private JLabel verifier5E;
    private JLabel verifier6A;
    private JLabel verifier6B;
    private JLabel verifier6C;
    private JLabel verifier6D;
    private JLabel verifier6E;
    private JButton button1;

    private int row = 0;
    private final String[] wordList = {"Abuse", "Adult", "Agent", "Anger", "Apple", "Award", "Basis", "Beach", "Birth", "Block", "Blood", "Board", "Brain", "Bread", "Buyer", "Chain", "Chair", "Chest",
            "Child", "Class", "Clock", "Coach", "Coast", "Court", "Cream", "Crime", "Crowd", "Crown", "Cycle", "Death", "Depth", "Draft", "Drama", "Dream", "Dress", "Earth", "Enemy", "Entry", "Error", "Event", "Faith", "Fault", "Field", "Floor", "Frame", "Frank", "Fruit", "Glass", "Grant", "Grass", "Group", "Guide", "Heart", "Horse", "Hotel", "House", "Image", "Index", "Input", "Knife", "Layer", "Lunch", "March", "Metal", "Model", "Money", "Month", "Motor", "Mouth", "Music", "Noise", "North", "Novel", "Nurse", "Owner", "Panel", "Paper", "Peace", "Peter", "Phase", "Piece", "Pilot", "Pitch", "Plane", "Plant", "Plate", "Pound", "Power", "Price", "Pride", "Prize", "Proof", "Queen", "Radio", "Range", "Ratio", "Reply", "River", "Route", "Rugby", "Scale", "Scene", "Scope", "Score", "Sense", "Shape", "Sheep", "Sheet", "Shirt", "Shock", "Sight", "Skill", "Smile", "Smith", "Smoke", "South", "Space", "Speed", "Sport", "Squad", "Staff", "Stage", "Steam", "Steel", "Stock", "Store", "Stuff", "Style", "Sugar", "Table", "Taste", "Theme", "Thing", "Title", "Tower", "Track", "Trade", "Trend", "Trial", "Truth", "Uncle", "Union", "Unity", "Value", "Video", "Water", "Woman", "World", "Youth", "Thine", "Which", "Yours", "Admit", "Adopt", "Agree", "Allow", "Apply", "Argue", "Arise", "Avoid", "Begin", "Blame", "Break", "Build", "Burst", "Carry", "Catch", "Cause", "Check", "Claim", "Climb", "Count", "Cover", "Dance", "Doubt", "Drink", "Drive", "Enjoy", "Enter", "Exist", "Fight", "Focus", "Force", "Guess", "Issue", "Judge", "Laugh", "Learn", "Leave", "Limit", "Match", "Occur", "Offer", "Order", "Phone", "Place", "Point", "Press", "Prove", "Raise", "Reach", "Refer", "Relax", "Serve", "Shall", "Share", "Shift", "Shoot", "Sleep", "Solve", "Speak", "Spend", "Split", "Stand", "Start", "State", "Stick", "Study", "Teach", "Thank", "Think", "Throw", "Touch", "Train", "Treat", "Trust", "Visit", "Voice", "Waste", "Watch", "Worry", "Would", "Write", "Alive", "Angry", "Aware", "Basic", "Black", "Blind", "Brave", "Brief", "Broad", "Brown", "Chief", "Civil", "Close", "Crazy", "Empty", "Equal", "Exact", "Faint", "Fifth", "Final", "Front", "Giant", "Grand", "Green", "Gross", "Happy", "Harsh", "Human", "Ideal", "Inner", "Joint", "Large", "Legal", "Level", "Local", "Lucky", "Magic", "Major", "Minor", "Moral", "Naked", "Outer", "Prime", "Proud", "Quiet", "Round", "Royal", "Rural", "Sixth", "Smart", "Solid", "Sorry", "Spare", "Steep", "Sweet", "Third", "Total", "Upset", "Urban", "Usual", "Vague", "Valid", "Vital", "White", "Whole", "Young", "Slash", "While", "Ahead", "Alone", "Aloud", "Apart", "Aside", "Awful", "Cheap", "Clean", "Clear", "Daily", "Dirty", "Early", "Extra", "False", "First", "Fresh", "Funny", "Great", "Heavy", "Hella", "Hence", "Light", "Maybe", "Never", "Often", "Other", "Party", "Piano", "Plain", "Prior", "Quick", "Rapid", "Right", "Rough", "Sadly", "Sharp", "Sheer", "Short", "Silly", "Sleek", "Small", "Sound", "Still", "Stone", "Super", "Thick", "Tight", "Today", "Truly", "Twice", "Where", "Wrong", "About", "Above", "After", "Along", "Among", "Below", "Cross", "Since", "Spite", "Under", "Until", "Bless", "Bravo", "Bring", "Ditto", "Fudge", "Havoc", "Hello", "Jesus", "Kapow", "Loose", "Marry", "Mercy", "Night", "Psych", "Quite", "Sniff", "There", "Tough", "Twirp", "Viola", "Wacko", "Woops"};

    private String getWord() {
        Random random = new Random();

        int randomNumber = random.nextInt(wordList.length);
        System.out.println(wordList[randomNumber].toLowerCase());
        return wordList[randomNumber].toLowerCase();
    }

    String wordToGuess = getWord();

    public MainFrame() {
        // Rules
        ImageIcon icon = new ImageIcon("./wordle.png");

        JOptionPane rules = new JOptionPane("""
                        You're supposed to guess the 5-letter word in 6 tries

                        Each guess must be a valid 5-letter word. Press the enter button to submit

                        After each guess, the text under the text-box will change to show how close your guess was to the word.

                        Examples:

                        
                        🆆 🄴 🄰 🅁 🅈  (W in green color)
                        "W" is in the word and in the correct spot.
                        
                        🄿 🅸 🄻 🄻 🅂  (I in yellow color)
                        "I" is in the word but in the wrong spot.
                        
                        🅅 🄰 🄶 🆄 🄴  (U in gray color)
                        "U" is  not in the word at any spot.""");

        rules.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        rules.setIcon(icon);

        JPanel buttonPanel = (JPanel) rules.getComponent(1);
        JButton okButton = (JButton) buttonPanel.getComponent(0);
        okButton.setText("Play");

        JDialog dialog = rules.createDialog("Rules");
        dialog.setVisible(true);

        // Main Background setup
        setContentPane(panel1);
        setTitle("Wordl");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.decode("#121213"));
        setSize(500,900);
        setVisible(true);
        setResizable(false);



        Font consolas = new Font("Consolas", Font.PLAIN, 36);
        Font cascadia = new Font("Cascadia Mono", Font.BOLD, 24);
        Dimension textFieldDimension = new Dimension(150, 35);
        Color green = Color.decode("#538D4E");
        Color gray = Color.decode("#3A3A3C");
        Color yellow = Color.decode("#B59F3B");


        // Title
        label1.setText("Wordl");
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial Black", Font.BOLD, 36));

        JTextField[] textFields = {textField1, textField2, textField3, textField4, textField5, textField6};

        JLabel[] verifiers1 = {verifier1A, verifier1B, verifier1C, verifier1D, verifier1E};
        JLabel[] verifiers2 = {verifier2A, verifier2B, verifier2C, verifier2D, verifier2E};
        JLabel[] verifiers3 = {verifier3A, verifier3B, verifier3C, verifier3D, verifier3E};
        JLabel[] verifiers4 = {verifier4A, verifier4B, verifier4C, verifier4D, verifier4E};
        JLabel[] verifiers5 = {verifier5A, verifier5B, verifier5C, verifier5D, verifier5E};
        JLabel[] verifiers6 = {verifier6A, verifier6B, verifier6C, verifier6D, verifier6E};

        JLabel[][] verifiers = {verifiers1, verifiers2, verifiers3, verifiers4, verifiers5, verifiers6};


        // Panel Setup
        for (int i = 0; i <= 5; i++) {
            textFields[i].setPreferredSize(textFieldDimension);
            textFields[i].setBackground(Color.decode("#121213"));
            textFields[i].setForeground(Color.WHITE);
            textFields[i].setDisabledTextColor(Color.WHITE);
            textFields[i].setFont(consolas);
            textFields[i].setCaretColor(Color.WHITE);
            textFields[i].setBorder(new LineBorder(Color.decode("#3A3A3C"), 2));
            textFields[i].setEnabled(false);
        }
        textField1.setEnabled(true);

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 4; j++) {
                verifiers[i][j].setPreferredSize(new Dimension(35, 35));
                verifiers[i][j].setText("");
                verifiers[i][j].setForeground(Color.WHITE);
                verifiers[i][j].setOpaque(true);
                verifiers[i][j].setFont(cascadia);
                verifiers[i][j].setHorizontalAlignment(0);
                verifiers[i][j].setVisible(false);
            }
        }


        button1.setText("Enter");
        button1.setPreferredSize(textFieldDimension);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.decode("#838384"));
        button1.setBorder(new LineBorder(Color.decode("#818384"), 1, true));

        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = textFields[row].getText();
                word = word.replace(" ", "");
                word = word.toLowerCase();

                if (word.length() != 5) {
                    JOptionPane.showMessageDialog(panel1, "Word must be 5 letters long", "Error", JOptionPane.ERROR_MESSAGE);
                    textFields[row].setText("");
                }


                else if (!(word.matches("[a-zA-Z]+"))) {
                    JOptionPane.showMessageDialog(panel1, "Only alphabets are allowed", "Error", JOptionPane.ERROR_MESSAGE);
                    textFields[row].setText("");
                }

/*
                COMMENTED OUT BECAUSE VERY LESS WORDS IN `wordList`
                boolean wordInList = false;

                for (String wordToMatch : wordList) {
                    if (word.equalsIgnoreCase(wordToMatch)) {
                        wordInList = true;
                        break;
                    }
                }
                if (!(wordInList)) {
                    JOptionPane.showMessageDialog(panel1, "Word not in list", "Error", JOptionPane.ERROR_MESSAGE);
                    textFields[row].setText("");
                }
*/

                else if (word.equalsIgnoreCase(wordToGuess)) {
                    textFields[row].setText(word.toUpperCase());
                    textFields[row].setVisible(false);
                    for (int i = 0; i <= 4; i++) {
                        verifiers[row][i].setVisible(true);
                        verifiers[row][i].setBackground(green);
                        verifiers[row][i].setText((String.valueOf(word.charAt(i)).toUpperCase()));
                    }

                    JOptionPane.showMessageDialog(panel1, "You guessed the word", "Congrats", JOptionPane.INFORMATION_MESSAGE);

                    setEnabled(false);
                    setVisible(false);
                }

                else {
                    // The booleans are in regard with the letters of `word`
                    boolean firstLetterAppeared = false;
                    boolean secondLetterAppeared = false;
                    boolean thirdLetterAppeared = false;
                    boolean fourthLetterAppeared = false;
                    boolean fifthLetterAppeared = false;

                    boolean[] letters = {firstLetterAppeared, secondLetterAppeared, thirdLetterAppeared, fourthLetterAppeared, fifthLetterAppeared};
                    int repeatedLetterIndex = 0;

                    for (int i = 0; i <= 4; i++) {
                        String letter = String.valueOf(word.charAt(i));
                        String letterToGuess = String.valueOf(wordToGuess.charAt(i));
                        verifiers[row][i].setText(letter.toUpperCase());
                        verifiers[row][i].setVisible(true);

                        if (letter.equals(letterToGuess)) {
                            verifiers[row][i].setBackground(green);
                        }

                        // `letter` appears in `wordToGuess` but not at index `i`
                        else if (wordToGuess.contains(letter)) {
                            int index = wordToGuess.indexOf(letter, repeatedLetterIndex + 1);

                            if (index == -1) { // If a letter wasn't being repeated in `wordToGuess` but we still checked for it, index will be -1 which is out of range for the `charAt` method
                                index = wordToGuess.indexOf(letter); // `index` is never equal to `i` because of the first if statement
                            }

                            // `letter` is at same index in `word` and `wordToGuess` but that will be taken care of when `i` is equal to `index` further in the loop
                            if (word.charAt(index) == wordToGuess.charAt(index)) {
                                verifiers[row][i].setBackground(gray);
                            }

                            else {
                                // If `letter` appears only once in `wordToGuess` and multiple times in `word`, then '*' should appear only once in `result`
                                if (!( letters[index]) ) {
                                    verifiers[row][i].setBackground(yellow);
                                    letters[index] = true;

                                    // Next time in the loop, it will look for the index of the same character after the position of `letter` in `wordToGuess` in-case it's being repeated in both `word` and `wordToGuess`
                                    repeatedLetterIndex = index;
                                }
                                else {
                                    verifiers[row][i].setBackground(gray);
                                }
                            }
                        }
                        // `letter` does not appear in `wordToGuess`
                        else {
                            verifiers[row][i].setBackground(gray);
                        }
                    }

                    textFields[row].setText(word.toUpperCase().replace("", " ").trim());
                    textFields[row].setVisible(false);

                    row++;
                    if (row < 6) {
                        textFields[row].setEnabled(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(panel1, "The word was '" + wordToGuess + "'", "You couldn't guess the word", JOptionPane.INFORMATION_MESSAGE);
                        setEnabled(false);
                        setVisible(false);
                    }

                    // Resetting the booleans
                    for (int i = 0; i <= 4; i++) {
                        letters[i] = false;
                    }
                }

            }
        };

        button1.addActionListener(action);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

}
