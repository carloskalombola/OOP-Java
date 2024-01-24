/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos K.
 */
// Declaracao da Classe
public class Animal {
	// Variáveis da instância
	String nome;
	int idade;
	String cor;

	// Declaracao do Construtor da Classe
	public Animal(String nome, int idade, String cor)
	{
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome()
	{
		return nome;
	}

	// Método 2
	public int getIdade()
	{
		return idade;
	}

	// Método 3
	public String getCor()
	{
		return cor;
	}

	public static void main(String[] args)
	{
                // Criação de objetos da classe Animal
		Animal elefante = new Animal("elefante", 5, "cinza/marrom");
                Animal zebra = new Animal("Zebrinha", 15, "preto/branco");
                
                // Acessa os dados do objeto por meio de referência
		System.out.println(elefante.getNome());
                System.out.println(elefante.getIdade());
                System.out.println(elefante.getCor());
                
                // Acessa os dados do objeto por meio de referência
                System.out.println(zebra.getNome());
                System.out.println(zebra.getIdade());
                System.out.println(zebra.getCor());                
	}
}
