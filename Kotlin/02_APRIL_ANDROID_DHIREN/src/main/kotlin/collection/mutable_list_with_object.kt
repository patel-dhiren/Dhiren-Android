package collection

data class Product(
    var pId:Int,
    var name:String,
    var mrp:Double,
    var discount:Float
){

    fun getSalePrice():Double
    {
        var dis = mrp*discount/100
        return mrp-dis
    }

}
fun main() {

    var productList = mutableListOf<Product>()
    productList.add(Product(123, "MacBook Pro", 120000.00, 5.0f))
    productList.add(Product(345, "Ipad", 78700.00, 10.0f))
    productList.add(Product(678, "Iphone", 113000.00, 25.0f))

    for(i in productList.indices)
    {
        var p = productList[i]
        println("name : ${p.name} price : ${p.mrp}")
    }

    println("****************")

    productList.forEach {
        println("name : ${it.name} price : ${it.mrp} salePrice : ${it.getSalePrice()}")
    }

}