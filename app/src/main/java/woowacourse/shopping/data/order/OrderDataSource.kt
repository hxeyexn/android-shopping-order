package woowacourse.shopping.data.order

import woowacourse.shopping.data.common.ResponseResult

interface OrderDataSource {
    fun order(cartItemIds: List<Long>): ResponseResult<Unit>
}
