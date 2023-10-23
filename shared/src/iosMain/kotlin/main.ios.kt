import androidx.compose.ui.uikit.OnFocusBehavior
import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController(configure = {
    onFocusBehavior = OnFocusBehavior.DoNothing
}) {
    App()
}