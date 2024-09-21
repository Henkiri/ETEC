fun main() {

    println("println() é uma função utilítaria e Main() tambem é uma função")

    bomDia()
    bomDia2()
    hello("Henkiri")

    var resultado = soma(2,4)
    println(resultado)

    println(subtracao(10.0, 9))
    println(divisao(10,2.5))

    mensagem("Henrique", "Bernardino")
    mensagem("Henrique", 18)
    mensagem(18, "Henrique")
}

fun bomDia()
{
    println("Bom dia")
}

fun bomDia2() = println("Bom dia 2")

fun hello(nome: String)
{
    println("Olá, $nome")
}

fun soma(a: Int, b: Int): Int
{
    var resultado = a + b
    return resultado
}

fun soma2(a: Int, b: Int) = a + b

fun subtracao(a: Double, b: Int = 3) = a - b
_
fun divisao(a: Int, b: Double) = (a / b)

fun mensagem(nome: String, sobrenome: String) = println("Bem-vindo $nome $sobrenome")
fun mensagem(nome: String, idade: Int) = println("O aluno $nome tem $idade")
fun mensagem(idade: Int, nome: String) = println("Você tem $idade anos, parabens $nome!")