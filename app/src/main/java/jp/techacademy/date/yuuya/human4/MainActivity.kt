package jp.techacademy.date.yuuya.human4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("伊達勇也", 23,"プログラミング")      // 名前を伊達勇也、年齢23歳で、Humanのインスタンスを作るa

        human.say()


        human.think()
    }
}


