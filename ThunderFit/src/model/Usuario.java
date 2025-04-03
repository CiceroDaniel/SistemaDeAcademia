package model;

import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.time.LocalDate;

public abstract class Usuario{
	//**----------------VARIÀVEIS-------------------**//
		protected String id;
		protected String nome;
		protected String cpf;
		protected String email;
		protected String telefone;
		protected LocalDate dataDeNascimento;
		protected Endereco endereco;
		protected boolean status;
		protected LocalDate dataDeCadastro;
		
		
		//**--------------CONSTRUTOR----------------------**//
		public Usuario(String nome, String cpf, String email, String telefone) {
			this.nome = nome;
			this.cpf = cpf;
			this.email = email;
			this.telefone = telefone;
			this.dataDeCadastro = LocalDate.now();
			this.status = true;
		}
		
		//**---------------METODOS ABSTRATOS--------------**//
		public abstract String gerarCredenciais();
		public abstract boolean temAcessoAdmin();
		
		//**--------------METODOS CONCRETOS-------------------**//
		public void desativarUsuario() {
			if(!this.status) {
				System.out.println("Usuario ja está desativado");
			}
			this.status = false;
		}
		
		public void ativarUsusario() {
			if(this.status) {
				System.out.println("Usuario ja está ativo");
			}
		}
		
		public void atualizarEmail(String novoEmail) {
			if(novoEmail != null && !novoEmail.isBlank()) {
				this.email = novoEmail;
			}
		}
		
		public void atualizarTelefone(String novoTelefone) {
			if(novoTelefone != null && !novoTelefone.isBlank()) {
				this.telefone = novoTelefone;
			}
		}
		
		public void atualizarEndereco(String novoEndereco) {
			if(novoEndereco != null && !novoEndereco.isBlank()) {
				this.telefone = novoEndereco;
			}
		}
		
		public int calcularIdade() {
			if(dataDeNascimento == null) {
				System.out.println("data de nascimento nao foi definida");
			}
			return LocalDate.now().getYear() - dataDeNascimento.getYear();
		}
		//**------------------ARQUIVO-------------------------**//
		public String toFileString() {
			return String.join(";",
					this.id,
					this.nome,
					this.cpf,
					this.email,
					this.telefone,
					this.dataDeNascimento != null ?  this.dataDeNascimento.format(DateTimeFormatter.ISO_DATE) : "",
					this.endereco != null ? this.endereco.toFileString() : "",
					String.valueOf(this.status),
					this.dataDeCadastro.format(DateTimeFormatter.ISO_DATE)
			);				
		}
		
		public void fromFileString(String fileString) {
			String[] partes = fileString.split(";");
			this.id = partes[0];
			this.nome = partes[1];
			this.cpf = partes[2];
			this.email = partes[3];
			this.telefone = partes[4];
			this.dataDeNascimento = partes[5].isEmpty() ? null : LocalDate.parse(partes[5]);
			
			//nao sei se essa parte ta funcionando
			if (partes[6].isEmpty())
				this.endereco = null;
			else
				this.endereco = new Endereco(fileString, fileString, fileString, fileString, fileString).fromFileString(partes[6]);
			this.status = Boolean.parseBoolean(partes[7]);
			this.dataDeCadastro = LocalDate.parse(partes[8]);
		}
		
		
		//**---------------GETTERS E SETTERS------------------**//
		public String getId() {
			return id;
		}
		
		public String getNome() {
			return nome;
		}
		
		public final void setNome(String nome) {
			if(nome == null || nome.trim().isEmpty() || nome.length() < 3) {
				System.out.println("nome invalido");
			}
			this.nome = nome.trim();
		}

		public String getCpf() {
			return cpf;
		}
		
		public final void setCpf(String cpf) {
			String limpaCpf = cpf.replaceAll("[^0-9]", "");
			if(limpaCpf.length() != 11) {
				System.out.println("o cpf dever conter apenas 11 digitos");
			}
			this.cpf = limpaCpf;
		}

		public String getEmail() {
			return email;
		}

		public final void setEmail(String email) {
			if(email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$")) {
				System.out.println("email invalido");
			}
			this.email = email.toLowerCase();
		}

		public String getTelefone() {
			return telefone;
		}

		public final void setTelefone(String telefone) {
			String limpaTelefone = telefone.replaceAll("[^0-9]", "");
			if(limpaTelefone.length() < 10 || limpaTelefone.length() > 11) {
				System.out.println("telefone invalido");
			}
			this.telefone = limpaTelefone;
		}

		
		
		
		
		
	}