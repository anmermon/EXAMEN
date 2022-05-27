/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import lexer.*;
/**
 *
 * @author Andre
 */
public class Node {
    int lexline = 0;
    Node(){lexline = Lexer.line;}
    void error(String s){throw new Error("cerca de la linea "+lexline+": "+s);}
    static int labels = 0;
    public int newlabel() {return ++labels;}
    public void emitlabel(int i){System.out.print("L"+i+":");}
    public void emit(String s){System.out.println("\t"+s);}
        
}
