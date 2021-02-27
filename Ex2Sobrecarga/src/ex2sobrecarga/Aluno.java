/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2sobrecarga;

/**
 *
 * @author Moreno
 */
public class Aluno {
    private int ra;
    private String nome;
    private String curso;
    private int anoIngresso;
    
    public Aluno(){}
    public Aluno(int ra, String nome, String curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }
    public Aluno(int ra){
        this.ra = ra;
    }
    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }
    public Aluno(int ra, String nome, String curso, int anoIngresso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
    }    
    public double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2)/2;
    }
    public double calcularMedia(double ac1, double ac2, double ag, double af){
       return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
    }
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
}
