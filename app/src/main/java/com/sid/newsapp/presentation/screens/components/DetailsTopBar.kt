package com.sid.newsapp.presentation.screens.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import com.sid.newsapp.R
import com.sid.newsapp.presentation.theme.NewsAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsTopBar(
    onBrowsingClick: () -> Unit,
    onShareClick: () -> Unit,
    onBookMarkClick: () -> Unit,
    onBackClick: () -> Unit,
) {

    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Transparent,
            actionIconContentColor = colorResource(id = R.color.body),
            navigationIconContentColor = colorResource(id = R.color.body),
        ),
        title = {},
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    modifier = Modifier
                        .semantics {
                                   contentDescription = "Back Icon"
                        },
                    painter = painterResource(id = R.drawable.ic_back_arrow),
                    contentDescription = null,
                )
            }
        },
        actions = {

            IconButton(onClick = onBookMarkClick) {
                Icon(
                    modifier = Modifier
                        .semantics {
                            contentDescription = "Bookmark Button"
                    },
                    painter = painterResource(id = R.drawable.ic_bookmark),
                    contentDescription = null
                )
            }
            IconButton(onClick = onShareClick) {
                Icon(
                    modifier = Modifier
                        .semantics {
                            contentDescription = "Share Button"
                        },
                    imageVector = Icons.Default.Share,
                    contentDescription = null
                )
            }
            IconButton(onClick = onBrowsingClick) {
                Icon(
                    modifier = Modifier
                        .semantics {
                            contentDescription = "Website Button"
                        },
                    painter = painterResource(id = R.drawable.ic_network),
                    contentDescription = null
                )
            }
        },
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DetailsTopBarPreview() {
    NewsAppTheme(dynamicColor = false) {
        DetailsTopBar(
            onShareClick = { /*TODO*/ },
            onBookMarkClick = { /*TODO*/ },
            onBrowsingClick = {}) {

        }
    }
}