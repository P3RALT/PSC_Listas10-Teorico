/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade10;

/**
 *
 * @author Windows
 */
public class Atividade10 {

  
    public static void main(String[] args) {
        // Pessoa
        Pessoa pessoa = new Pessoa("Gabriel", 21, "12345678900", "gabriel@email.com");
        System.out.println(pessoa.getNome() + " está se apresentando:");
        pessoa.falar();
        pessoa.comer("churrasco");

        System.out.println("-----------------------------");

        // Carro
        Carro carro = new Carro("Fusca", "Azul", 1972);
        System.out.println("Carro modelo " + carro.getModelo() + " está pronto.");
        carro.ligar();
        carro.acelerar();
        carro.buzinar();

        System.out.println("-----------------------------");

        // Animal
        Animal animal = new Animal("Cachorro", "Thor", 4);
        System.out.println(animal.getNome() + " é um " + animal.getEspecie() + ".");
        animal.emitirSom();
        animal.comer();
    }
}

  