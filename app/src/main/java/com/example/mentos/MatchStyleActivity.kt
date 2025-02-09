package com.example.mentos

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MatchStyleActivity : AppCompatActivity() {
    private lateinit var genderRecyclerView: RecyclerView
    private lateinit var mentostyleRecyclerView: RecyclerView
    private lateinit var mentoenvRecyclerView: RecyclerView
    private lateinit var genderAdapter: SelectAdapter
    private lateinit var mentostyleAdapter: SelectAdapter
    private lateinit var mentoenvAdapter: SelectAdapter

    private val GenderList = listOf(
        SelectItem("남자"),
        SelectItem("여자"),
        SelectItem("상관없음"),

    )

    private val MentoStyleList = listOf(
        SelectItem("꼼꼼함"),
        SelectItem("활발함"),
        SelectItem("친목"),
        SelectItem("차분함"),
        SelectItem("천천히"),
        SelectItem("스파르타"),
        SelectItem("신중함"),
        SelectItem("긍정적"),
        SelectItem("비즈니스"),
        SelectItem("협력적")
    )

    private val MentoEnvList = listOf(
        SelectItem("온라인"),
        SelectItem("오프라인"),
        SelectItem("둘 다"),
        SelectItem("기타")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_style)

        // 성별 RecyclerView 설정
        genderRecyclerView = findViewById(R.id.ActivityMS_gender_rv)
        genderRecyclerView.layoutManager = GridLayoutManager(this, 5)
        genderAdapter = SelectAdapter(GenderList) { categoryName ->
            Toast.makeText(this, "선택한 카테고리: $categoryName", Toast.LENGTH_SHORT).show()
        }
        genderRecyclerView.adapter = genderAdapter

        // 멘토 스타일 RecyclerView 설정
        mentostyleRecyclerView = findViewById(R.id.ActivityMS_mentostyle_rv)
        mentostyleRecyclerView.layoutManager = GridLayoutManager(this, 5)
        mentostyleAdapter = SelectAdapter(MentoStyleList) { categoryName ->
            Toast.makeText(this, "선택한 카테고리: $categoryName", Toast.LENGTH_SHORT).show()
        }
        mentostyleRecyclerView.adapter = mentostyleAdapter

        // 멘토 환경 RecyclerView 설정
        mentoenvRecyclerView = findViewById(R.id.ActivityMS_mentoEnv_rv)
        mentoenvRecyclerView.layoutManager = GridLayoutManager(this, 5)
        mentoenvAdapter = SelectAdapter(MentoEnvList) { categoryName ->
            Toast.makeText(this, "선택한 카테고리: $categoryName", Toast.LENGTH_SHORT).show()
        }
        mentoenvRecyclerView.adapter = mentoenvAdapter
    }

}