package com.example.workouts

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>
    {
        val exerciseList=ArrayList<ExerciseModel>()

        val jumpingJacks=ExerciseModel(1,"Jumping Jacks",R.drawable.ic_jumping_jacks,false,false)
        exerciseList.add(jumpingJacks)

        val pushUp=ExerciseModel(2,"Push Ups", R.drawable.ic_push_up,false,false)
        exerciseList.add(pushUp)

        val tricepsdips=ExerciseModel(3,"Triceps dips", R.drawable.ic_triceps_dip_on_chair,false,false)
        exerciseList.add(jumpingJacks)

        val wallSit=ExerciseModel(4,"Wall Sit", R.drawable.ic_wall_sit,false,false)
        exerciseList.add(wallSit)

        val abdominalCruch=ExerciseModel(5,"Abdominal Crunches", R.drawable.ic_abdominal_crunch,false,false)
        exerciseList.add(abdominalCruch)

        val stepUpOnChair=ExerciseModel(6,"Step-Up onto Chair", R.drawable.ic_step_up_onto_chair,false,false)
        exerciseList.add(stepUpOnChair)

        val lunges=ExerciseModel(7,"Lunges", R.drawable.ic_lunge,false,false)
        exerciseList.add(lunges)

        val plank=ExerciseModel(8,"Planks", R.drawable.ic_plank,false,false)
        exerciseList.add(plank)

        val pushupandrotaion=ExerciseModel(9,"Push ups and rotation", R.drawable.ic_push_up_and_rotation,false,false)
        exerciseList.add(pushupandrotaion)


        val squats=ExerciseModel(10,"Squats", R.drawable.ic_squat,false,false)
        exerciseList.add(squats)

        return exerciseList
    }
}