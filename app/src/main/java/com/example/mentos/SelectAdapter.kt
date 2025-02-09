package com.example.mentos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class SelectAdapter(
    private val categoryList: List<SelectItem>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<SelectAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryButton: Button = itemView.findViewById(R.id.categoryButton)

        fun bind(item: SelectItem) {
            categoryButton.text = item.categoryName

            // 선택 상태에 따른 배경 설정
            if (item.isSelected) {
                categoryButton.setBackgroundResource(R.drawable.btn_selected) // 선택됨
            } else {
                categoryButton.setBackgroundResource(R.drawable.btn_beforeselect) // 기본 상태
            }

            // 버튼 클릭 시 상태 변경
            categoryButton.setOnClickListener {
                item.isSelected = !item.isSelected // 선택 상태 토글
                notifyItemChanged(adapterPosition) // 해당 아이템만 업데이트
                onItemClick(item.categoryName) // 선택된 카테고리 이름 전달
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_select_button, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }

    override fun getItemCount(): Int = categoryList.size
}

