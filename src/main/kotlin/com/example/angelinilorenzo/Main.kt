package com.example.angelinilorenzo

import com.example.angelinilorenzo.views.javafx.HTML5View
import javafx.application.Application
import tornadofx.App

class HTML5App : App(HTML5View::class)

fun main(args: Array<String>) = Application.launch(HTML5App::class.java)