/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inter;

/**
 *
 * @author Andre
 */
public class Break extends Stmt{
    Stmt stmt;
    public Break(){
        if( Stmt.Enclosing == Stmt.Null) error("break no encerrada");
        stmt = Stmt.Enclosing;
    }
    public void gen(int b,int a){
        emit("goto L" + stmt.after);
    }   
}
