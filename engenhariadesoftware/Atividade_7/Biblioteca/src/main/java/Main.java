import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        // Adicionar livros
        bib.addLivro(new Livro("Senhor dos Anéis", "Tolkien", "123"));
        bib.addLivro(new Livro("Java", "Autor Desconhecido", "321"));

        // Buscar por título
        List<Livro> encontrados = bib.buscarLivroTitulo("Java");
        System.out.println("Encontrados: " + encontrados.size());
        for (Livro l : encontrados) {
            System.out.println("→ " + l.getTitulo() + " - " + l.getAutor());
        }

        // Buscar por ISBN
        Livro l = bib.buscarLivroIsbn("123");
        if (l != null)
            System.out.println("ISBN 123 é: " + l.getTitulo());
    }
}