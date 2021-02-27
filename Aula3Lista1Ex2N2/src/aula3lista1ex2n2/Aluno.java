/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3lista1ex2n2;

/**
 *
 * @author Moreno
 */
public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;
    private int codigoEscola;
    
    public Aluno(String ra){
        this();
        this.ra = ra;
    }
    public Aluno(){
        codigoEscola = 5;
    }
    public Aluno(String ra, String nome){        
        this(ra);
        this.nome = nome;        
    }
    public Aluno(String ra, String nome, float ac1, float ac2, float ag, float af){
        this(ra,nome);
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.ag = ag;
        this.af = af;
    }
    
    public float calcularMedia(){
        return (ac1 * 0.15f) + (ac2 *0.30f) + (ag * 0.10f) + (af * 0.45f);
    }
    public String verificarAprovacao(){
        if(calcularMedia() >= 5)
            return "Aprovado";
        return "Reprovado";
    }
    public String imprimir(){
        return "RA: " + ra +
                "\nNome: " + nome +
                "\nAc1: " + ac1 +
                "\nAc2: " + ac2 +
                "\nAg: " + ag +
                "\nAf: " + af +
                "\nMédia: " + calcularMedia() +
                "\nSituação: " + verificarAprovacao();
    }
    public void setRa(String ra){
        this.ra = ra;
    }
    public String getRa(){
        return ra;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ac1
     */
    public float getAc1() {
        return ac1;
    }

    /**
     * @param ac1 the ac1 to set
     */
    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    /**
     * @return the ac2
     */
    public float getAc2() {
        return ac2;
    }

    /**
     * @param ac2 the ac2 to set
     */
    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    /**
     * @return the ag
     */
    public float getAg() {
        return ag;
    }

    /**
     * @param ag the ag to set
     */
    public void setAg(float ag) {
        this.ag = ag;
    }

    /**
     * @return the af
     */
    public float getAf() {
        return af;
    }

    /**
     * @param af the af to set
     */
    public void setAf(float af) {
        this.af = af;
    }
    
}
