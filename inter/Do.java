/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import symbols.*;
/**
 *
 * @author Andre
 */
public class Do extends Stmt{
    Expr expr; Stmt stmt;
    public Do() {expr = null; stmt = null;}
    public void init(Stmt s, Expr x){
        expr = x; stmt = s;
        if(expr.type != Type.Bool) expr.error("se requiere booleano en do");
    }
    public void gen(int b, int a){
        after = a;
        int label = newlabel();
        stmt.gen(b, label);
        emitlabel(label);
        expr.jumping(b,0);
    }   
}
