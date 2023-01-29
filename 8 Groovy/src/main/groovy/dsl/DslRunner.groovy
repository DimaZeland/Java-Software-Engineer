package dsl

import static DslBuilder.*

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setText("sdfsdfs")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)

// builder
mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images(['image.jpg', 'image2.png'])
        image 'test.jpeg'
    }
}