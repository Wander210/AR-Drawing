package com.gdd.ar_drawing.epoxy.controller

import com.airbnb.epoxy.EpoxyController
import com.gdd.ar_drawing.itemImage
import com.gdd.ar_drawing.model.Image


class RecentListController(
    private val onItemClick: (Image) -> Unit
) : EpoxyController() {

    var listImage: LinkedHashSet<Image> = LinkedHashSet()
        set(value) {
            field = value
            requestModelBuild()
        }

    fun moveImageToTop(target: Image) {
        if (listImage.remove(target)) {
            listImage.add(target)
            requestModelBuild()
        }
    }

    // Khi kế thừa EpoxyController, cần override phương thức buildModels.
    // Tại đây chúng ta sẽ cho Epoxy Recycler View biết mình muốn hiển thị dữ liệu theo thứ tự cũng như cách thức thế nào
    override fun buildModels() {
        listImage.toList().asReversed().forEach { item ->
            itemImage {
                // Lưu ý id của mỗi Model phải khác nhau
                id(item.id)
                url(item.src)
                isSelected(item.isSelected)
                onClick { _ ->
                    this@RecentListController.onItemClick(item)
                    this@RecentListController.moveImageToTop(item)
                }
            }
        }
    }
}