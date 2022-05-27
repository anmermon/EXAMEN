/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;
import lexer.*;
import symbols.*;
/**
 *
 * @author Andre
 */
public class And extends Logical {
    public And (Token tok, Expr x1, Expr x2){super (tok, x1, x2);}
    public void jumping(int t, int f){
        int label = f != 0 ? f : newlabel();
        expr1.jumping (0, label);
        expr2.jumping(t,f);
        if(f == 0)emitlabel(label);
    }   
}
