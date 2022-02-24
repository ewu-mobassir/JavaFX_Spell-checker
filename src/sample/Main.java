package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Application {
    static lnode dictRoot = new lnode();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Spellchecker");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) throws FileNotFoundException {
        // DICTIONARY SOURCE 200k: http://www.gwicks.net/dictionaries.htm
        // DICTIONARY SOURCE 370k: https://github.com/dwyl/english-words 
        FileInputStream dict = new FileInputStream("dict200k.txt");
        Scanner fileinput = new Scanner(dict);
        while (fileinput.hasNext()){
            addWord(fileinput.next());
        }
        System.out.println("Dictionary Loaded");

        launch(args);
    }
    public static void addWord(String s)
    {
        lnode current = dictRoot;
        for (int i = 0; i<s.length(); i++) {
            //System.out.println(s.charAt(i));
            switch (s.charAt(i)){

                case 'a':
                case 'A':
                    if(current.a==null)
                        current.a = new lnode();
                    current.a.setCurrentWord(current.getCurrentWord()+"a");
                    current.a.setParent(current);
                    current = current.a;
                    break;
                case 'b':
                case 'B':
                    if(current.b==null)
                        current.b = new lnode();
                    current.b.setCurrentWord(current.getCurrentWord()+"b");
                    current.b.setParent(current);
                    current = current.b;
                    break;
                case 'c':
                case 'C':
                    if(current.c==null)
                        current.c = new lnode();
                    current.c.setCurrentWord(current.getCurrentWord()+"c");
                    current.c.setParent(current);
                    current = current.c;
                    break;
                case 'd':
                case 'D':
                    if(current.d==null)
                        current.d = new lnode();
                    current.d.setCurrentWord(current.getCurrentWord()+"d");
                    current.d.setParent(current);
                    current = current.d;
                    break;
                case 'e':
                case 'E':
                    if(current.e==null)
                        current.e = new lnode();
                    current.e.setCurrentWord(current.getCurrentWord()+"e");
                    current.e.setParent(current);
                    current = current.e;
                    break;
                case 'f':
                case 'F':
                    if(current.f==null)
                        current.f = new lnode();
                    current.f.setCurrentWord(current.getCurrentWord()+"f");
                    current.f.setParent(current);
                    current = current.f;
                    break;
                case 'g':
                case 'G':
                    if(current.g==null)
                        current.g = new lnode();
                    current.g.setCurrentWord(current.getCurrentWord()+"g");
                    current.g.setParent(current);
                    current = current.g;
                    break;
                case 'h':
                case 'H':
                    if(current.h==null)
                        current.h = new lnode();
                    current.h.setCurrentWord(current.getCurrentWord()+"h");
                    current.h.setParent(current);
                    current = current.h;
                    break;
                case 'i':
                case 'I':
                    if(current.i==null)
                        current.i = new lnode();
                    current.i.setCurrentWord(current.getCurrentWord()+"i");
                    current.i.setParent(current);
                    current = current.i;
                    break;
                case 'j':
                case 'J':
                    if(current.j==null)
                        current.j = new lnode();
                    current.j.setCurrentWord(current.getCurrentWord()+"j");
                    current.j.setParent(current);
                    current = current.j;
                    break;
                case 'k':
                case 'K':
                    if(current.k==null)
                        current.k = new lnode();
                    current.k.setCurrentWord(current.getCurrentWord()+"k");
                    current.k.setParent(current);
                    current = current.k;
                    break;
                case 'l':
                case 'L':
                    if(current.l==null)
                        current.l = new lnode();
                    current.l.setCurrentWord(current.getCurrentWord()+"l");
                    current.l.setParent(current);
                    current = current.l;
                    break;
                case 'm':
                case 'M':
                    if(current.m==null)
                        current.m = new lnode();
                    current.m.setCurrentWord(current.getCurrentWord()+"m");
                    current.m.setParent(current);
                    current = current.m;
                    break;
                case 'n':
                case 'N':
                    if(current.n==null)
                        current.n = new lnode();
                    current.n.setCurrentWord(current.getCurrentWord()+"n");
                    current.n.setParent(current);
                    current = current.n;
                    break;
                case 'o':
                case 'O':
                    if(current.o==null)
                        current.o = new lnode();
                    current.o.setCurrentWord(current.getCurrentWord()+"o");
                    current.o.setParent(current);
                    current = current.o;
                    break;
                case 'p':
                case 'P':
                    if(current.p==null)
                        current.p = new lnode();
                    current.p.setCurrentWord(current.getCurrentWord()+"p");
                    current.p.setParent(current);
                    current = current.p;
                    break;
                case 'q':
                case 'Q':
                    if(current.q==null)
                        current.q = new lnode();
                    current.q.setCurrentWord(current.getCurrentWord()+"q");
                    current.q.setParent(current);
                    current = current.q;
                    break;
                case 'r':
                case 'R':
                    if(current.r==null)
                        current.r = new lnode();
                    current.r.setCurrentWord(current.getCurrentWord()+"r");
                    current.r.setParent(current);
                    current = current.r;
                    break;
                case 's':
                case 'S':
                    if(current.s==null)
                        current.s = new lnode();
                    current.s.setCurrentWord(current.getCurrentWord()+"s");
                    current.s.setParent(current);
                    current = current.s;
                    break;
                case 't':
                case 'T':
                    if(current.t==null)
                        current.t = new lnode();
                    current.t.setCurrentWord(current.getCurrentWord()+"t");
                    current.t.setParent(current);
                    current = current.t;
                    break;
                case 'u':
                case 'U':
                    if(current.u==null)
                        current.u = new lnode();
                    current.u.setCurrentWord(current.getCurrentWord()+"u");
                    current.u.setParent(current);
                    current = current.u;
                    break;
                case 'v':
                case 'V':
                    if(current.v==null)
                        current.v = new lnode();
                    current.v.setCurrentWord(current.getCurrentWord()+"v");
                    current.v.setParent(current);
                    current = current.v;
                    break;
                case 'w':
                case 'W':
                    if(current.w==null)
                        current.w = new lnode();
                    current.w.setCurrentWord(current.getCurrentWord()+"w");
                    current.w.setParent(current);
                    current = current.w;
                    break;
                case 'x':
                case 'X':
                    if(current.x==null)
                        current.x = new lnode();
                    current.x.setCurrentWord(current.getCurrentWord()+"x");
                    current.x.setParent(current);
                    current = current.x;
                    break;
                case 'y':
                case 'Y':
                    if(current.y==null)
                        current.y = new lnode();
                    current.y.setCurrentWord(current.getCurrentWord()+"y");
                    current.y.setParent(current);
                    current = current.y;
                    break;
                case 'z':
                case 'Z':
                    if(current.z==null)
                        current.z = new lnode();
                    current.z.setCurrentWord(current.getCurrentWord()+"z");
                    current.z.setParent(current);
                    current = current.z;
                    break;
            }
        }
        current.setEndOfWord(true);
    }
}
