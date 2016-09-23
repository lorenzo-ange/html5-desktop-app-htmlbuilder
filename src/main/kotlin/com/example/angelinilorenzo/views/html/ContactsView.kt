package com.example.angelinilorenzo.views.html

import com.example.angelinilorenzo.models.Contact
import com.example.angelinilorenzo.htmlbuilder.*
import com.example.angelinilorenzo.views.javafx.HTML5View

fun contactsView(contacts: List<Contact>) = defaultLayout {
    contacts.forEach { contactPanel(it) }
}

fun HtmlBodyTag.contactPanel(contact: Contact) {
    div("contact panel panel-info") {
        div("panel-heading") { h3("panel-title") { +contact.name } }
        div("panel-body") {
            div("row") {
                div("col-md-3 col-lg-3") {
                    attribute("align", "center")
                    img("img-circle img-responsive") {
                        alt = "${contact.name} pic"
                        src = HTML5View.resourceLink("/img/default-avatar.jpg")
                    }
                }
                div("col-md-9 col-lg-9") {
                    table("table table-contact-information") {
                        tbody {
                            tr { td { +"Phone:" }; td { +contact.phone } }
                            tr { td { +"Email:" }; td { +contact.email } }
                            tr { td { +"Address:" }; td { +contact.address } }
                        }
                    }
                }
            }
        }
    }
}
