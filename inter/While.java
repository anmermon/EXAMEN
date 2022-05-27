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
public class While extends Stmt{
    Expr expr; Stmt stmt;
    public While(){expr = null; stmt = null;}
    public void init(Expr x, Stmt s){
        expr = x; stmt = s;
        if(expr.type != Type.Bool) expr.error("se requiere un booleano en while");
    }
    public void gen(int b, int a){
        after = a;
        expr.jumping(0, a);
        int label = newlabel();
        emitlabel(label); stmt.gen(label, b);
        emit("goto L" + b);
    }    
}
