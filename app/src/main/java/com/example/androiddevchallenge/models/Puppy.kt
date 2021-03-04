package com.example.androiddevchallenge.models

import com.example.androiddevchallenge.data.Gender
import com.example.androiddevchallenge.data.Status

data class Puppy(var Name: String, var Breed: String,
                 var Age:String, var Image: Int, var Gender: Gender,
                 var Status:Status, var City: String, var Description: String)