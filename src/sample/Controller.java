package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.*;

import java.io.IOException;

public class Controller {
    lnode current;
    String word = "";



    @FXML
    private TextArea textbox;

    @FXML
    private Label curword;

    @FXML
    private Label isValid;

    @FXML
    private ListView<String> suggestList;

    @FXML
    private Label translated;


    @FXML
    void checkSpelling(){
        suggestList.getItems().clear();
        int wordStart;
        if(textbox.getText().lastIndexOf(' ')+1==textbox.getText().length()) {
            if(textbox.getText().length()>0)
                wordStart = (textbox.getText().substring(0, textbox.getText().length() - 1).lastIndexOf(' ') + 1);
            else
                wordStart = (textbox.getText().lastIndexOf(' ')+1);
        }
        else
            wordStart = (textbox.getText().lastIndexOf(' ')+1);
        if(wordStart>0)
            word = textbox.getText(wordStart,textbox.getText().length()).toUpperCase();
        else
            word = textbox.getText().toUpperCase();
        System.out.println(word);
        if(word.length()==0)
            current = Main.dictRoot;
        textbox.setOnKeyPressed(key -> {
            if (key.getCode().equals(KeyCode.BACK_SPACE)){
                if(word.length()>0&&current.getParent()==null)
                    current = traverse(word);
                else if(word.length()==current.getCurrentWord().length())
                    current =  current.getParent();
                else if(word.length()==1)
                    current = Main.dictRoot;

            }
            else if (key.getCode().equals(KeyCode.SPACE)){
                current = Main.dictRoot;
                curword.setText("");
            }
            else
                current = traverseTo(key.getCode());
        });
        if(word.length()>current.getCurrentWord().length())
            addSuggestions(current);
        if(current.getCurrentWord().length()>word.length())
            traverse(word);
        curword.setText(word);
        System.out.println(curword.getText() +"  "+ current.getCurrentWord() + "  "+ current.isEndOfWord());
        if(current.isEndOfWord()&&current.getCurrentWord().toUpperCase().equals(word))
            isValid.setText("Yes");
        else
            isValid.setText("No");
    }
    
    @FXML
    void replaceWord(MouseEvent event) {
        String s;
        word = suggestList.getSelectionModel().getSelectedItem();
        if(textbox.getText().lastIndexOf(' ')>1)
            s = textbox.getText().substring(0, textbox.getText().lastIndexOf(' ')+1);
        else
            s = "";
        s = s+word;
        textbox.setText(s);
        traverse(word);
        isValid.setText("Yes");
        curword.setText(word.toUpperCase());
    }
    
    @FXML
    void suggestWords(ActionEvent event) {
        suggestList.getItems().clear();
        addSuggestions(current);
    }
    
    public void addSuggestions(lnode n){
        if(n!=null){
            if(n.isEndOfWord())
                suggestList.getItems().add(n.getCurrentWord());
            addSuggestions(n.a);
            addSuggestions(n.b);
            addSuggestions(n.c);
            addSuggestions(n.d);
            addSuggestions(n.e);
            addSuggestions(n.f);
            addSuggestions(n.g);
            addSuggestions(n.h);
            addSuggestions(n.i);
            addSuggestions(n.j);
            addSuggestions(n.k);
            addSuggestions(n.l);
            addSuggestions(n.m);
            addSuggestions(n.n);
            addSuggestions(n.o);
            addSuggestions(n.p);
            addSuggestions(n.q);
            addSuggestions(n.r);
            addSuggestions(n.s);
            addSuggestions(n.t);
            addSuggestions(n.u);
            addSuggestions(n.v);
            addSuggestions(n.w);
            addSuggestions(n.x);
            addSuggestions(n.y);
            addSuggestions(n.z);
        }
    }
    
    

    @FXML
    void translate(ActionEvent event) {
        try {
            translated.setText(GoogleTranslate.translate("bn",textbox.getText()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    lnode traverseTo(KeyCode key)
    {
            switch (key){
                case A:
                    word = word+"A";
                    if(current.a!=null)
                        current = current.a;
                    break;
                case B:
                    word = word+"B";
                    if(current.b!=null)
                        current = current.b;
                    break;
                case C:
                    word = word+"C";
                    if(current.c!=null)
                        current = current.c;
                    break;
                case D:
                    word = word+"D";
                    if(current.d!=null)
                        current = current.d;
                    break;
                case E:
                    word = word+"E";
                    if(current.e!=null)
                        current = current.e;
                    break;
                case F:
                    word = word+"F";
                    if(current.f!=null)
                        current = current.f;
                    break;
                case G:
                    word = word+"G";
                    if(current.g!=null)
                        current = current.g;
                    break;
                case H:
                    word = word+"H";
                    if(current.h!=null)
                        current = current.h;
                    break;
                case I:
                    word = word+"I";
                    if(current.i!=null)
                        current = current.i;
                    break;
                case J:
                    word = word+"J";
                    if(current.j!=null)
                        current = current.j;
                    break;
                case K:
                    word = word+"K";
                    if(current.k!=null)
                        current = current.k;
                    break;
                case L:
                    word = word+"L";
                    if(current.l!=null)
                        current = current.l;
                    break;
                case M:
                    word = word+"M";
                    if(current.m!=null)
                        current = current.m;
                    break;
                case N:
                    word = word+"N";
                    if(current.n!=null)
                        current = current.n;
                    break;
                case O:
                    word = word+"O";
                    if(current.o!=null)
                        current = current.o;
                    break;
                case P:
                    word = word+"P";
                    if(current.p!=null)
                        current = current.p;
                    break;
                case Q:
                    word = word+"Q";
                    if(current.q!=null)
                        current = current.q;
                    break;
                case R:
                    word = word+"R";
                    if(current.r!=null)
                        current = current.r;
                    break;
                case S:
                    word = word+"S";
                    if(current.s!=null)
                        current = current.s;
                    break;
                case T:
                    word = word+"T";
                    if(current.t!=null)
                        current = current.t;
                    break;
                case U:
                    word = word+"U";
                    if(current.u!=null)
                        current = current.u;
                    break;
                case V:
                    word = word+"V";
                    if(current.v!=null)
                        current = current.v;
                    break;
                case W:
                    word = word+"W";
                    if(current.w!=null)
                        current = current.w;
                    break;
                case X:
                    word = word+"X";
                    if(current.x!=null)
                        current = current.x;
                    break;
                case Y:
                    word = word+"Y";
                    if(current.y!=null)
                        current = current.y;
                    break;
                case Z:
                    word = word+"Z";
                    if(current.z!=null)
                        current = current.z;
                    break;
            }
        return current;
    }

    lnode traverse(String s)
    {
        current = Main.dictRoot;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'a':
                case 'A':
                    if(current.a!=null)
                        current = current.a;
                    break;
                case 'b':
                case 'B':
                    if(current.b!=null)
                        current = current.b;
                    break;
                case 'c':
                case 'C':
                    if(current.c!=null)
                        current = current.c;
                    break;
                case 'd':
                case 'D':
                    if(current.d!=null)
                        current = current.d;
                    break;
                case 'e':
                case 'E':
                    if(current.e!=null)
                        current = current.e;
                    break;
                case 'f':
                case 'F':
                    if(current.f!=null)
                        current = current.f;
                    break;
                case 'g':
                case 'G':
                    if(current.g!=null)
                        current = current.g;
                    break;
                case 'h':
                case 'H':
                    if(current.h!=null)
                        current = current.h;
                    break;
                case 'i':
                case 'I':
                    if(current.i!=null)
                        current = current.i;
                    break;
                case 'j':
                case 'J':
                    if(current.j!=null)
                        current = current.j;
                    break;
                case 'k':
                case 'K':
                    if(current.k!=null)
                        current = current.k;
                    break;
                case 'l':
                case 'L':
                    if(current.l!=null)
                        current = current.l;
                    break;
                case 'm':
                case 'M':
                    if(current.m!=null)
                        current = current.m;
                    break;
                case 'n':
                case 'N':
                    if(current.n!=null)
                        current = current.n;
                    break;
                case 'o':
                case 'O':
                    if(current.o!=null)
                        current = current.o;
                    break;
                case 'p':
                case 'P':
                    if(current.p!=null)
                        current = current.p;
                    break;
                case 'q':
                case 'Q':
                    if(current.q!=null)
                        current = current.q;
                    break;
                case 'r':
                case 'R':
                    if(current.r!=null)
                        current = current.r;
                    break;
                case 's':
                case 'S':
                    if(current.s!=null)
                        current = current.s;
                    break;
                case 't':
                case 'T':
                    if(current.t!=null)
                        current = current.t;
                    break;
                case 'u':
                case 'U':
                    if(current.u!=null)
                        current = current.u;
                    break;
                case 'v':
                case 'V':
                    if(current.v!=null)
                        current = current.v;
                    break;
                case 'w':
                case 'W':
                    if(current.w!=null)
                        current = current.w;
                    break;
                case 'x':
                case 'X':
                    if(current.x!=null)
                        current = current.x;
                    break;
                case 'y':
                case 'Y':
                    if(current.y!=null)
                        current = current.y;
                    break;
                case 'z':
                case 'Z':
                    if(current.z!=null)
                        current = current.z;
                    break;
            }
        }
        System.out.println("Curword= "+current.getCurrentWord());
        return current;
    }

    @FXML
    public void initialize() {
        current = Main.dictRoot;
        checkSpelling();
    }

}
