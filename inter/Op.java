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
public class Op extends Expr {
    public Op(Token tok,Type p){super(tok,p);}
    public Expr reduce(){
        Expr  x = gen();
        Temp t = new Temp(type);
        emit(t.toString()+ " = " + x.toString());
        return t;
    }    
}
