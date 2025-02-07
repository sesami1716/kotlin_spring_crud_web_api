package com.example.kotlin_spring_crud_web_api

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

/**
 * Customer テーブルを操作するメソッドをまとめたインタフェース
 *
 */
interface CustomerRepository {
    /**
     * Customer テーブルにデータを挿入するメソッド
     *
     * @param firstName
     * @param lastName
     */
    fun add(firstName: String, lastName: String)

    /**
     * Customer テーブルから全てのデータを取得するメソッド
     *
     * @return
     */
    fun find(): List<Customer>

    /**
     * Customer テーブルのカラムを更新するメソッド
     *
     * @param id
     * @param firstName
     * @param lastName
     */
    fun update(id: Int, firstName: String, lastName: String)

    /**
     * Customer テーブルのカラムを単一削除するメソッド
     *
     * @param id
     */
    fun delete(id: Int)
}