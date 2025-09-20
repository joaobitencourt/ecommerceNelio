# Nome do Projeto / Tema de Estudo

[![Status](https://img.shields.io/badge/Status-Em%20Estudo-ff69b4)](https://github.com/seu-usuario/seu-repositorio)
[![Tipo](https://img.shields.io/badge/Tipo-Repositório%20de%20Estudos-blue)](https://github.com/seu-usuario/seu-repositorio)

Um repositório dedicado aos meus estudos sobre **[Assunto Principal]**. Aqui organizo resumos, anotações, códigos-exemplo e links valiosos encontrados durante minha aprendizagem.

---

## 📚 Índice de Tópicos

*   [Tópico 1: Nome do Tópico](#tópico-1-nome-do-tópico)
*   [Recursos Gerais](#recursos-gerais)
*   [Como Usar Este Repositório](#como-usar-este-repositório)

---

## Tópico 1: Stream
*(Ex: Conceitos Fundamentais de Python, Introdução a APIs REST, Como o CSS Grid funciona)*

**Resumo/Anotações:**
O Stream é uma interface usado para facilitar o processamento de dados, tendo algumas funções como o ".filter()" que auxilia na filtragem de um dado dentro da
lista que está sendo processado pelo stream. Outro exemplo de função é o ".map()" que converte cada elemento do fluxo para outro tipo.

*   Exemplo de código .map():
    ```JAVA
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploMap {
public static void main(String[] args) {
List<String> palavras = Arrays.asList("cafe", "codigo", "java");List<String> palavrasMaiusculas = palavras.stream()
.map(String::toUpperCase)
.collect(Collectors.toList());
System.out.println(palavrasMaiusculas);
}
}
    ```

**Links para Discussão e Aprofundamento:**
*   [Java Streams na Prática: Exemplos e Boas Práticas](https://www.dio.me/articles/java-streams-na-pratica-exemplos-e-boas-praticas) - Discussão muito clara sobre *[assunto específico]*.
*   [Interface Stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html) - Site do Oracle *[Stream Tecnicamente explicado]*.
---


## Tópico 2: JPA notCamel case
Se você não definir o nome da coluna da tabela com a notação "@Column":
Exemplo:
@Column(name = "imgUrl")
private String imgUrl 

por padrão ele pega o exemple a cima é cria a cluna como sneakcase img_url.
Mas para resolver isso é só seguir esse padrão de
@Column(name = "imgUrl")
private String imgUrl

## 🔗 Recursos Gerais

Aqui estão alguns recursos que não se encaixam em um tópico específico mas foram extremamente úteis:

*   **[MDN Web Docs](https://developer.mozilla.org/)** - A melhor documentação para web development.
*   **[W3Schools](https://www.w3schools.com/)** - Ótimo para consultas rápidas e exemplos.
*   **[freeCodeCamp Forum](https://forum.freecodecamp.org/)** - Comunidade incrível e muito prestativa para iniciantes.

---

## ❓ Como Usar Este Repositório

Este é primariamente um repositório pessoal para organizar meu aprendizado. Sinta-se à vontade para:
1.  **Explorar os tópicos** se você também estiver estudando o mesmo assunto.
2.  **Consultar os links** que reuni, eles contêm informações valiosas da comunidade.
3.  **Abrir uma Issue** se encontrar algum link quebrado ou tiver uma sugestão de recurso para adicionar.

*"A documentação é um presente que você dá ao seu eu futuro." - Alguém sábio na internet*
