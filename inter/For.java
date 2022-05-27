/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

import symbols.*;
import java.lang.*;

/**
 *
 * @author Andre
 */
public class For extends Stmt {
    Expr E1;
    Expr E2;
    Expr E3;
    Stmt S;
    public For(){ E1 = null; E2 = null; E3 = null; S = null;}
    public void init(Expr expr1, Expr expr2, Expr expr3, Stmt stmt){
        E1 = expr1;
        E2 = expr2;
        E3 = expr3;
        S = stmt;
        if(E2.type != Type.Bool) E2.error("se requiere de un boleano");
    }
    public void gen(int b, int a){
        int etiqueta1 = newlabel();
        E2.jumping(0, b);
        emitlabel(etiqueta1); S.gen(etiqueta1, a);
        emit("goto L" + a);
    }
}