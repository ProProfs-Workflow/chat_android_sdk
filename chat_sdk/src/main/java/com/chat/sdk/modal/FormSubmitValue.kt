package com.chat.sdk.modal

internal data class FormSubmitValue(
    var name:String,
    var email:String,
    val dynamicStringParams:HashMap<String, String>,
    val dynamicArrayParams:HashMap<String, ArrayList<String>>
    )
