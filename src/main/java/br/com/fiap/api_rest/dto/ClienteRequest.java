package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.enums.Categoria;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClienteRequest {
    private String nome;
    private int idade;
    private String email;
    private String password;
    private String cpf;
    private Categoria categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
