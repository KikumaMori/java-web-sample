package com.example;

import org.teavm.jso.browser.Window;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class App {
	public static void main(String[] args) {
		HTMLDocument document = Window.current().getDocument();

		HTMLElement messageElement = document.getElementById("message");

		if (messageElement != null) {
			// innerText の代わりに、JS側プロパティにアクセスするか、
			// または確実に安全な書き方に変更します
			Window.alert("Javaから要素を発見しました！"); // デバッグ用ポップアップ

			// TeaVMでテキストを設定する一般的な書き方：
			messageElement.setInnerHTML("こんにちは！この文字はJava（TeaVM）から出力されています！");
		} else {
			Window.alert("要素が見つかりませんでした...");
		}
	}
}