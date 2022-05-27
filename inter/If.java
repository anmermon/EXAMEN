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
public class If extends Stmt{
    Expr expr; Stmt stmt;
    public If(Expr x, Stmt s){
        expr = x; stmt = s;
        if(expr.type != Type.Bool) expr.error("se requiere un booleano en if");
    }
    public void gen(int b, int a){
        int label = newlabel();
        expr.jumping(0, a);
        emitlabel(label); stmt.gen(label, a);
    }    
}
