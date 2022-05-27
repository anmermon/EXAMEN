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
public class Or extends Logical {
    public Or(Token tok, Expr x1, Expr x2){super(tok, x1, x2);}
    public void jumping (int t, int f){
        int label = t != 0 ? t : newlabel();
        expr1.jumping(label, 0);
        expr2.jumping(t,f);
        if(t == 0) emitlabel(label);
    }    
}
