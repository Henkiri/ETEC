// Aula 9: Controle de Fluxo Condicional: "if" - Henrique Bernardino

fun main()
{
    maioridade(23)
    maioridade(16)

    habilitacao(21)
    habilitacao(15)

    idoso(65)
    idoso(29)

    ingresso(64)
    ingresso(10)
    ingresso(30)
}

//1
fun maioridade(idade: Int)
{
    if (idade > 17)
    {
        println("1) É maior de idade;")
    }
    printl("---- Fim da Função 1 ----")
}

// 2
fun habilitacao(idade: Int)
{
    if(idade > 17)
    {
        println("2) Você pode obter uma habilitação;")
    }

    if(idade < 18)
    {
        printl("2) Você não pode obter uma habilitação.")
    }
}

// 3
fun idoso(idade: Int)
{
    if(idade > 59)
    {
        println("3) É um idoso")
    }
    else
    {
        println("3) Não é um idoso")
    }
}

// 4
fun ingresso(idade: Int)
{
    if(idade > 59)
    {
        println("4) É um idoso e não paga ingresso")
    }
    else if(idade < 13)
    {
        println("4) É um jovem com menos de 13 e paga meia")
    }
    else
    {
        println("4) Paga inteira")
    }
    println("4a) Bem-Vindo ao Mementos")
}