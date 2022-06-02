<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>

<center>
	<h2>お問い合わせフォーム</h2>
	<form action="../servlet/contact" method="post">

		<p>
			氏名(※必須)：<input type="text" name="name" size=30 required>
		</p>

		<p>
			会社: <input type="text" name="company" size=30>
		</p>

		<p>
			メールアドレス(※必須): <input type="text" name="mail" size=30 required>
		<p>お問い合わせ内容をご記入ください。(※必須)</p>
		<p>
			<textarea name="review" cols="30" rows="5" required></textarea>
		</p>

		<p>メルマガの種類を選択してください。</p>

		<p>
			<input type="checkbox" name="merumaga" value="総合案内">総合案内
		</p>
		<p>
			<input type="checkbox" name="merumaga" value="セミナー案内">セミナー案内
		</p>
		<p>
			<input type="checkbox" name="merumaga" value="求人採用情報">求人採用情報
		</p>

		<p>
		<p>資料請求はご希望されますか？</p>
		<input type="radio" name="hope" value="yes">Yes <input
			type="radio" name="hope" value="no">No

		<p>
			<input type="submit" value="確定">
		</p>
	</form>
</center>


<%@include file="../footer.html"%>