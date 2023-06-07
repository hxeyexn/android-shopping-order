package woowacourse.shopping.presentation.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import woowacourse.shopping.databinding.ItemCartBinding
import woowacourse.shopping.presentation.cart.viewholder.CartItemViewHolder
import woowacourse.shopping.presentation.common.CartProductDiffItemCallback
import woowacourse.shopping.presentation.model.CartProductInfoModel

class CartAdapter(
    private val presenter: CartContract.Presenter,
) : ListAdapter<CartProductInfoModel, CartItemViewHolder>(CartProductDiffItemCallback()) {

    private lateinit var binding: ItemCartBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartItemViewHolder {
        binding =
            ItemCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartItemViewHolder(
            binding = binding,
            presenter = presenter,
        )
    }

    override fun onBindViewHolder(holder: CartItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
