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
public class Not extends Logical{
    public Not(Token tok, Expr x2){super(tok, x2, x2);}
    public void jumping(int t, int f){expr2.jumping(f, t);}
    public String toString(){return op.toString()+" "+expr2.toString();}   
}
