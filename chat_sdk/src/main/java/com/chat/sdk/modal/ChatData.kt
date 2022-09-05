package com.chat.sdk.modal

import com.chat.sdk.util.CommonUtil

internal data class Message(
    val id_ip: String,
    val message: String,
    var msg_status: String,
    val msgtm: String,
    val pushurl: String,
    val rand_no: String,
    var sno: String,
    val v_o: String
)

internal data class OperatorDetails(
    val photourl: String,
    val name: String,
)


internal data class ChatData(
    val chat_status: String,
    val messages: ArrayList<Message>,
    val operator_status: List<Operator>,
    val messages_status: Any,
    val operator_details:Any
) {
    companion object GetChatRequestParam {
        var site_id: String? = null
        var proprofs_language_id: String? = null
        var ProProfs_Session: String? = null
        var ProProfs_Msg_Counter: String = "0"
        var ProProfs_Visitor_TimeZone: Int = CommonUtil().getTimeZone()
        var ProProfs_invitation_type: String = "1"
        var ProProfs_Current_URL: String = "chat_sdk"
        var ProProfsGroupIdHardCoded: String = "0"
        var ProProfs_Visitor_name: String = ""
        var ProProfs_Visitor_email: String = ""
        var ProProfs_typing_message: String = ""
    }
}

