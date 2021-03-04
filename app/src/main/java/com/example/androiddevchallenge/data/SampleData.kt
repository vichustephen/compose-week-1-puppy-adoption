package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Puppy

enum class Gender{
    MALE,
    FEMALE
}enum class Status{
    AVAILABLE,
    UNAVAILABLE
}
 val puppyData = listOf<Puppy>(
     Puppy("Jimmy","Doberman",
        "2 months old", R.drawable.doberman,Gender.MALE,Status.AVAILABLE,"Madurai",
         ""),
     Puppy("Lilli","Labrador",
        "24 Days old",R.drawable.labrador,Gender.FEMALE,Status.UNAVAILABLE,"Coimbatore",
         "Lovely Lilli, a Labrador-mix girl, is another abandoned baby at the Sanjay Gandhi Animal Care Centre, " +
                 "Raja Garden, Coimbatore, waiting for loving family to take her home. "),
     Puppy("Johny","German Shepherd",
        "2 Months old",R.drawable.german_shephered_puppy,Gender.MALE,Status.AVAILABLE,"Chennai  ",
         "This sweet boy is presently living with the family that rescued him. He was found on a Delhi road being attacked by other dogs. " +
                 "These kind people brought him home to safety. "),
     Puppy("Molly","Indian Pariah",
        "2 Months old",R.drawable.puppy_grass,Gender.FEMALE,Status.AVAILABLE,"Coimbatore",
         "Molly is a very nice girl. He's playful and friendly, and he's currently looking for a forever home where he gets the love, " +
                 "plus the treatos. If you feel you are the one please come forward."),
     Puppy("Laila","Golden Retriever",
        "20 Days old",R.drawable.goldie,Gender.FEMALE,Status.AVAILABLE,"Kochi",
         "Laila is a very nice girl. She's playful and friendly, and she's currently looking for a forever home where she gets the love, plus the treatos. " +
                 "If you feel you are the one please come forward."),
     Puppy("Rocky","German Shepherd",
        "1 Month old",R.drawable.young_german_shepherd,Gender.MALE,Status.AVAILABLE,"Delhi",
         "German Shepherd boy Rocky was abandoned by unknown persons somewhere in Delhi, and brought at the Sanjay Gandhi animal shelter Raja Garden, " +
                 "New Delhi. He has wounds on both his front paws, which are healing. Rocky is extremely friendly and gentle."),
 )