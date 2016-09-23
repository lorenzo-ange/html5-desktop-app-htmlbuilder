package com.example.angelinilorenzo.views.html

import com.example.angelinilorenzo.htmlbuilder.*
import com.example.angelinilorenzo.views.javafx.HTML5View

fun defaultLayout(content: HtmlBodyTag.() -> Unit) = html {
    head {
        link(href = HTML5View.resourceLink("/css/bootstrap.min.css"), rel = "stylesheet")
        link(href = HTML5View.resourceLink("/css/contacts.css"), rel = "stylesheet")
        title { +"My contacts" }
    }
    body {
        div("container") {
            div("row") {
                div("col-md-6 col-md-offset-3") {
                    content()
                }
            }
        }
    }
}
