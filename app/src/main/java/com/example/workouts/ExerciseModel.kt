package com.example.workouts

import android.media.Image

class ExerciseModel (
    private var id:Int,
    private var name:String,
    private var image:Int,
    private var isCompleted: Boolean,
    private var isSelected:Boolean)
{
    fun getId(): Int{
        return id
    }

    fun setId(id: Int){
        this.id=id
    }

    fun getname(): String{
        return name
    }

    fun setname(name: String){
        this.name=name
    }

    fun getisCompleted(): Boolean{
        return isCompleted
    }

    fun setisCompleted(isCompleted: Boolean){
        this.isCompleted=isCompleted
    }

    fun getimage(): Int{
        return image
    }

    fun setimage(image: Int){
        this.image=image
    }

    fun getisSelected(): Boolean{
        return isSelected
    }

    fun setisSelected(isCompleted: Boolean){
        this.isSelected=isSelected
    }
}

