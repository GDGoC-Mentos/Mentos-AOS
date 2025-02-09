package com.example.mentos

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RegisterCategoryActivity : AppCompatActivity() {
    private lateinit var studyRecyclerView: RecyclerView
    private lateinit var healthRecyclerView: RecyclerView
    private lateinit var etcRecyclerView: RecyclerView
    private lateinit var studyAdapter: SelectAdapter
    private lateinit var healthAdapter: SelectAdapter
    private lateinit var etcAdapter: SelectAdapter

    private val StudycategoryList = listOf(
        SelectItem("코딩"),
        SelectItem("외국어"),
        SelectItem("자격증"),
        SelectItem("독서"),
        SelectItem("자소서"),
        SelectItem("프로젝트"),
        SelectItem("면접"),
        SelectItem("수학"),
        SelectItem("과학"),
        SelectItem("사회")
    )

    private val HealthcategoryList = listOf(
        SelectItem("다이어트"),
        SelectItem("식단"),
        SelectItem("헬스"),
        SelectItem("필라테스"),
        SelectItem("테니스")
    )

    private val etccategoryList = listOf(
        SelectItem("종교"),
        SelectItem("미술"),
        SelectItem("음악"),
        SelectItem("주식"),
        SelectItem("부동산")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_category)

        // 🟢 공부 카테고리 RecyclerView 설정
        studyRecyclerView = findViewById(R.id.ActivityRC_studyCate_rv)
        studyRecyclerView.layoutManager = GridLayoutManager(this, 5)
        studyAdapter = SelectAdapter(StudycategoryList) { categoryName ->
            Toast.makeText(this, "선택한 카테고리: $categoryName", Toast.LENGTH_SHORT).show()
        }
        studyRecyclerView.adapter = studyAdapter

        // 🟢 건강 카테고리 RecyclerView 설정
        healthRecyclerView = findViewById(R.id.ActivityRC_healthCate_rv)
        healthRecyclerView.layoutManager = GridLayoutManager(this, 5)
        healthAdapter = SelectAdapter(HealthcategoryList) { categoryName ->
            Toast.makeText(this, "선택한 카테고리: $categoryName", Toast.LENGTH_SHORT).show()
        }
        healthRecyclerView.adapter = healthAdapter

        // 🟢 기타 카테고리 RecyclerView 설정
        etcRecyclerView = findViewById(R.id.ActivityRC_etcCate_rv)
        etcRecyclerView.layoutManager = GridLayoutManager(this, 5)
        etcAdapter = SelectAdapter(etccategoryList) { categoryName ->
            Toast.makeText(this, "선택한 카테고리: $categoryName", Toast.LENGTH_SHORT).show()
        }
        etcRecyclerView.adapter = etcAdapter
    }
}
