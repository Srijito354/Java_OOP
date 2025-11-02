import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="QuizApplet" width=400 height=300>
</applet>
*/

public class QuizApplet extends Applet implements ActionListener {
    Label question;
    CheckboxGroup options;
    Checkbox opt1, opt2, opt3, opt4;
    Button nextBtn;
    int current = 0, score = 0;

    String[] questions = {
        "Which company developed Java?",
        "Which keyword is used to inherit a class?",
        "Which of these is not a Java feature?"
    };

    String[][] choices = {
        {"Microsoft", "Sun Microsystems", "Apple", "Google"},
        {"this", "extent", "extends", "implement"},
        {"Object-oriented", "Robust", "Pointer-based", "Platform-independent"}
    };

    int[] answers = {1, 2, 2}; // correct answer indices (0-based)

    public void init() {
        setLayout(new GridLayout(6, 1));
        question = new Label();
        options = new CheckboxGroup();

        opt1 = new Checkbox("", options, false);
        opt2 = new Checkbox("", options, false);
        opt3 = new Checkbox("", options, false);
        opt4 = new Checkbox("", options, false);

        nextBtn = new Button("Next");
        nextBtn.addActionListener(this);

        add(question);
        add(opt1);
        add(opt2);
        add(opt3);
        add(opt4);
        add(nextBtn);

        showQuestion();
    }

    void showQuestion() {
        question.setText("Q" + (current + 1) + ": " + questions[current]);
        opt1.setLabel(choices[current][0]);
        opt2.setLabel(choices[current][1]);
        opt3.setLabel(choices[current][2]);
        opt4.setLabel(choices[current][3]);
        options.setSelectedCheckbox(null);
    }

    public void actionPerformed(ActionEvent e) {
        int selectedIndex = -1;
        Checkbox selected = options.getSelectedCheckbox();
        if (selected == opt1) selectedIndex = 0;
        else if (selected == opt2) selectedIndex = 1;
        else if (selected == opt3) selectedIndex = 2;
        else if (selected == opt4) selectedIndex = 3;

        if (selectedIndex == answers[current]) {
            score++;
        }

        current++;
        if (current < questions.length) {
            showQuestion();
        } else {
            removeAll();
            add(new Label("Quiz Finished! Your score: " + score + "/" + questions.length));
            validate();
            repaint();
        }
    }
}