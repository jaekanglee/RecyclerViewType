package com.example.recyclerviewtypesample.data

class Model {

    init {
    }

    //각자 다른 뷰타입을 아이템 7개에 순차적으로  Insert
    fun makeTestEntities(): ArrayList<Item> {
        var items = ArrayList<Item>()
        for (i in 1..7) {
            var item =
                Item(i)
            items.add(item)
        }

        return items
    }


    data class Item(
        var viewType: Int = 0
    ) {

    }
}