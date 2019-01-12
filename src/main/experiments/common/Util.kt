package experiments.common

import io.kubernetes.client.apis.CoreV1Api
import io.kubernetes.client.util.Config

fun <T>withApi(cb: CoreV1Api.() -> T): T {
    val api = CoreV1Api(Config.defaultClient())
    return api.cb()
}