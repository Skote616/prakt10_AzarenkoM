class MTS():Oper() {
    override var ch=true
    override var name=""
    override var description=""
    override var coating=0.0
    override var cost=0.0
    override fun info() {
        try{
            var x:Double
            println("name")
            name= readln()
            println("Покрытие")
            x= readln()!!.toDouble()
            if(x>0){
                coating= x
                println("Цена")
                x= readln()!!.toDouble()
                if(x>0){
                    cost= x
                    println("Описание")
                    description= readln()!!.toString()
                    ch=true
                }
                else{
                    println("Ошибка")
                    ch=false
                }
            }
            else{
                println("Ошибка")
                ch=false
            }

        }catch (e:Exception){
            println("Ошибка")
        }
    }



    override fun rate():Double {
        return (100.0*coating/cost)
    }
    override fun output() {
        if(ch==true){
            println("Оператор $name")
            println("Описание $description")
            println("Покрытие $coating")
            println("Стоимость $cost")
            println("Оценка ${rate()}")
        }
    }
}
