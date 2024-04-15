import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String email;
    private LocalDate dataNascimento;
    private String rg;

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();

    public Usuario(String nome, String sobrenome, String cpf, String telefone, String cidade, String bairro,
                   String rua, String numero, String email, LocalDate dataNascimento, String rg) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
    }

    public Usuario() {
    }
    
    // Métodos GET e SET 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
     
    //Cadastro para usuario// 
    ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    
    public static void criarUsuario(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite o bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Digite a rua: ");
        String rua = scanner.nextLine();
        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
        System.out.print("Digite o RG: ");
        String rg = scanner.nextLine();

        Usuario usuario = new Usuario(nome, sobrenome, cpf, telefone, cidade, bairro, rua, numero, email,
                dataNascimento, rg);
        usuarios.add(usuario);
        System.out.println("Usuário criado com sucesso!");
    }

    public static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de Usuários:");
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario usuario = usuarios.get(i);
                System.out.println("Índice: " + i);
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Sobrenome: " + usuario.getSobrenome());
                System.out.println("CPF: " + usuario.getCpf());
                System.out.println("Telefone: " + usuario.getTelefone());
                System.out.println("Cidade: " + usuario.getCidade());
                System.out.println("Bairro: " + usuario.getBairro());
                System.out.println("Rua: " + usuario.getRua());
                System.out.println("Número: " + usuario.getNumero());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
                System.out.println("RG: " + usuario.getRg());
                System.out.println("----------------------------------");
            }
        }
    }


    public static void editarUsuario(Scanner scanner) {
        listarUsuarios();
        System.out.print("Digite o índice do usuário que deseja editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < usuarios.size()) {
            Usuario usuario = usuarios.get(indice);

            System.out.print("Digite o novo nome: ");
            usuario.setNome(scanner.nextLine());
            System.out.print("Digite o novo sobrenome: ");
            usuario.setSobrenome(scanner.nextLine());
            System.out.print("Digite o novo CPF: ");
            usuario.setCpf(scanner.nextLine());
            System.out.print("Digite o novo telefone: ");
            usuario.setTelefone(scanner.nextLine());
            System.out.print("Digite a nova cidade: ");
            usuario.setCidade(scanner.nextLine());
            System.out.print("Digite o novo bairro: ");
            usuario.setBairro(scanner.nextLine());
            System.out.print("Digite a nova rua: ");
            usuario.setRua(scanner.nextLine());
            System.out.print("Digite o novo número: ");
            usuario.setNumero(scanner.nextLine());
            System.out.print("Digite o novo email: ");
            usuario.setEmail(scanner.nextLine());
            System.out.print("Digite a nova data de nascimento (AAAA-MM-DD): ");
            String dataNascimentoStr = scanner.nextLine();
            usuario.setDataNascimento(LocalDate.parse(dataNascimentoStr));
            System.out.print("Digite o novo RG: ");
            usuario.setRg(scanner.nextLine());

            System.out.println("Usuário editado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public static void removerUsuario(Scanner scanner) {
        listarUsuarios();
        System.out.print("Digite o índice do usuário que deseja remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < usuarios.size()) {
            usuarios.remove(indice);
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public static void visualizarUsuario(Scanner scanner) {
        listarUsuarios();
        System.out.print("Digite o índice do usuário que deseja visualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < usuarios.size()) {
            Usuario usuario = usuarios.get(indice);
            System.out.println("Detalhes do usuário:");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Sobrenome: " + usuario.getSobrenome());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Telefone: " + usuario.getTelefone());
            System.out.println("Cidade: " + usuario.getCidade());
            System.out.println("Bairro: " + usuario.getBairro());
            System.out.println("Rua: " + usuario.getRua());
            System.out.println("Número: " + usuario.getNumero());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
            System.out.println("RG: " + usuario.getRg());
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    //MENU para ALUNO, PROFESSOR E COLEGIO//
    //////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

    public static void menuCadastro() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Menu de Cadastro");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Cadastrar Escola");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                //case 3:
                //    cadastrarEscola();
                //    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
    
    //Cadastro para aluno//
    //////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

    public static void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        int opcao1;

        do {
            System.out.println("Menu:");
            System.out.println("1 - criar Aluno");
            System.out.println("2 - Editar Aluno");
            System.out.println("3 - Remover Aluno");
            System.out.println("4 - Visualizar Aluno");
            System.out.println("5 - Listar Aluno");
            System.out.println("6 - Cadastrar aluno");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao1 = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao1) {
                case 1:
                    criarAluno(scanner);
                    break;
                case 2:
                    editarAluno(scanner);
                    break;
                case 3:
                    removerAluno(scanner);
                    break;
                case 4:
                    listarAlunos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao1 != 7);

        scanner.close();
    }

    public static void criarAluno(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        // Mais informações do aluno...
    
        // Verificar se o aluno está na lista de usuários
        boolean encontrado = false;
        for (Usuario usuario : Usuario.usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                encontrado = true;
                break;
            }
        }
    
        if (encontrado) {
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Digite o bairro: ");
            String bairro = scanner.nextLine();
            System.out.print("Digite a rua: ");
            String rua = scanner.nextLine();
            System.out.print("Digite o número: ");
            String numero = scanner.nextLine();
            System.out.print("Digite o email: ");
            String email = scanner.nextLine();
            System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
            String dataNascimentoStr = scanner.nextLine();
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
            System.out.print("Digite o RG: ");
            String rg = scanner.nextLine();
            System.out.print("Digite o nome da mãe: ");
            String nomeDaMae = scanner.nextLine();
            System.out.print("Digite o nome do pai: ");
            String nomeDoPai = scanner.nextLine();
            System.out.print("O aluno precisa de atendimento especial? (true/false): ");
            boolean atendimentoEspecial = scanner.nextBoolean();
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();
            System.out.print("Digite o curso do aluno: ");
            String curso = scanner.nextLine();
    
            Aluno aluno = new Aluno(nome, sobrenome, cpf, telefone, cidade, bairro, rua, numero, email,
                    dataNascimento, rg, nomeDaMae, nomeDoPai, atendimentoEspecial, matricula, curso);
            alunos.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            // Se o aluno não estiver na lista, exibir mensagem de erro
            System.out.println("Erro: O aluno não está na lista de usuários!");
        }
    }
    

    

    public static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (int i = 0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                System.out.println("Índice: " + i);
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome()); // Supondo que tenha um método getNome em Usuario
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("----------------------------------");
            }
        }
    }

    public static void editarAluno(Scanner scanner) {
        listarAlunos();
        System.out.print("Digite o índice do aluno que deseja editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < alunos.size()) {
            Aluno aluno = alunos.get(indice);

            
            System.out.print("Digite a nova matrícula do aluno: ");
            aluno.setMatricula(scanner.nextLine());
            System.out.print("Digite o novo curso do aluno: ");
            aluno.setCurso(scanner.nextLine());

            System.out.println("Aluno editado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }


   

    public static void removerAluno(Scanner scanner) {
        listarAlunos();
        System.out.print("Digite o índice do aluno que deseja remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    // Cadastrar Professores //
    ///////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////

    public static void cadastrarProfessor() {
        Scanner scanner = new Scanner(System.in);
        int opcao1;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar professor");
            System.out.println("2 - Editar professor");
            System.out.println("3 - Remover professor");
            System.out.println("4 - Listar professor");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao1 = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao1) {
                case 1:
                    cadastrarProfessor(scanner);
                    break;
                case 2:
                    editarProfessor(scanner);
                    break;
                case 3:
                    removerProfessor(scanner);
                    break;
                case 4:
                    listarProfessor();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao1 != 7);

        scanner.close();
    }

    public static void cadastrarProfessor(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
            
        // Verificar se o professor está na lista de usuários
        boolean encontrado = false;
        for (Usuario usuario : Usuario.usuarios) {
            if (usuario.getCpf().equals(cpf)) {
                encontrado = true;
                break;
            }
        }
    
        if (encontrado) {
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Digite a cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Digite o bairro: ");
            String bairro = scanner.nextLine();
            System.out.print("Digite a rua: ");
            String rua = scanner.nextLine();
            System.out.print("Digite o número: ");
            String numero = scanner.nextLine();
            System.out.print("Digite o email: ");
            String email = scanner.nextLine();
            System.out.print("Digite a data de nascimento (AAAA-MM-DD): ");
            String dataNascimentoStr = scanner.nextLine();
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
            System.out.print("Digite o RG: ");
            String rg = scanner.nextLine();
            System.out.print("Digite o nome da mãe: ");
            String nomeDaMae = scanner.nextLine();
            System.out.print("Digite o nome do pai: ");
            String nomeDoPai = scanner.nextLine();
            System.out.print("O professor precisa de atendimento especial? (true/false): ");
            boolean atendimentoEspecial = scanner.nextBoolean();
            scanner.nextLine(); // Limpar o buffer do scanner
            System.out.print("Digite a matrícula do professor: ");
            String matricula = scanner.nextLine();
            System.out.print("Digite a disciplina do professor: ");
            String curso = scanner.nextLine();
    
            Professor professor = new Professor(nome, sobrenome, cpf, telefone, cidade, bairro, rua, numero, email,
                    dataNascimento, rg, nomeDaMae, nomeDoPai, atendimentoEspecial, matricula, curso);
            professores.add(professor);
            System.out.println("Cadastrado do professor feito com sucesso!");
        } else {
            // Se o professor não estiver na lista, exibir mensagem de erro
            System.out.println("Erro: O professor não está na lista de usuários!");
        }
    }
    
    public static void listarProfessor() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            System.out.println("Lista de professores:");
            for (int i = 0; i < professores.size(); i++) {
                Professor professor = professores.get(i);
                System.out.println("Índice: " + i);
                System.out.println("Matrícula: " + professor.getMatricula());
                System.out.println("Nome: " + professor.getNome()); // Supondo que tenha um método getNome em Usuario
                System.out.println("Curso: " + professor.getCurso());
                System.out.println("----------------------------------");
            }
        }
    }

    public static void editarProfessor(Scanner scanner) {
        listarProfessor();
        System.out.print("Digite o índice do professor que deseja editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < professores.size()) {
            Professor professor = professores.get(indice);
                        
            System.out.print("Digite a nova matrícula do professor: ");
            professor.setMatricula(scanner.nextLine());
            System.out.print("Digite o novo curso do professor: ");
            professor.setCurso(scanner.nextLine());

            System.out.println("professor editado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    public static void removerProfessor(Scanner scanner) {
        listarProfessor();
        System.out.print("Digite o índice do professor que deseja remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (indice >= 0 && indice < professores.size()) {
            professores.remove(indice);
            System.out.println("Professor removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Criar usuário");
            System.out.println("2 - Editar usuário");
            System.out.println("3 - Remover usuário");
            System.out.println("4 - Visualizar usuário");
            System.out.println("5 - Listar usuários");
            System.out.println("6 - menuCadastro");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    criarUsuario(scanner);
                    break;
                case 2:
                    editarUsuario(scanner);
                    break;
                case 3:
                    removerUsuario(scanner);
                    break;
                case 4:
                    visualizarUsuario(scanner);
                    break;
                case 5:
                    listarUsuarios();
                    break;
                case 6:
                    menuCadastro();
                    break;    
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
      
    }
}
