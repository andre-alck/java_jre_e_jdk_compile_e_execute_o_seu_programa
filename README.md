# Curso de Java JRE e JDK: compile e execute o seu programa

**JAVA = \*.java**

## Capítulo 1

Java Virtual Machine (JVM): multiplataforma, é responsável por ler e executar o Bytecode gerado após a compilação do arquivo \*.java.

## Capítulo 2

```
javac Programa.java
java Programa
```

javac: comando utilizado no Prompt de Comando para compilar um arquivo \*.java. Recebe em sequência o nome do arquivo JAVA. Gera o arquivo Bytecode (\*.class). (JDK.)

java: comando utilizado para executar o Bytecode através da JVM. Recebe em sequência o nome da classe, não do arquivo. (JRE.)

## Capítulo 4

Casting:

```java
int valor = (int)1250.50; // = 1250
```

[Tamanhos](https://www.w3schools.com/java/java_data_types.asp)

## Capítulo 5

```java
int um = 1;
String frase = "Concatenando uma String com " + um + " Inteiro.";
System.out.println(frase); // Compilando uma String com 1 Inteiro.
```

## Capítulo 6

Escopo: entre chaves.

```java
&&
||
```

Java não tem keywords "and" e "or".

## Capítulo 7

```java
//for
int valorMaximo = 10;
int outroValor = valorMaximo / 2;

for (int i = 0; i < valorMaximo; i++) {
    if (i % outroValor == 0 && i != 0) {
        System.out.println(i);
        break;
    }
}
```

```java
//while
int valorMaximo = 10;
int outroValor = valorMaximo / 2;

int i = 0;
while (i < valorMaximo) {
    if (i % outroValor == 0 && i != 0) {
        System.out.println(i);
        break;
    }

    i++;
}
```